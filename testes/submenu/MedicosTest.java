package submenu;

import model.Medico;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Date;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MedicosTest {
    public static Medico m1;
    public static Medico m2;
    public static Medico m3;

    @BeforeAll
    public static void inicializaObjetos(){
        m1 = new Medico("Joao","MASCULINO", "joaomedico@email", "(16)912345678", new Date(),
                "123456", "cardiologia", "USP");
        m2 = new Medico("Maria","FEMININO", "mariamedica@email", "(16)123456789", new Date(),
                "543210", "ortopedia", "UFSCAR");
        m3 = new Medico("José","MASCULINO", "josemedico@email", "(11)999999999", new Date(),
                "111222", "pediatria", "santa casa");
    }

    @ParameterizedTest(name = "Teste {index}")
    @Order(1)
    @DisplayName("Testes parametrizados dos metodos get e set de Medico")
    @MethodSource("provedorArgumentosMedico")
    public void testesGetSet(Medico medico) throws CloneNotSupportedException {
        final Medico medico1 = medico.clone(); // utilizando set

        assertAll(
                () -> assertEquals(medico1.getCRM(), medico.getCRM()),
                () -> assertEquals(medico1.getNome(), medico.getNome()),
                () -> assertEquals(medico1.getSexo(), medico.getSexo()),
                () -> assertEquals(medico1.getEmail(), medico.getEmail()),
                () -> assertEquals(medico1.getEspecialidade(), medico.getEspecialidade()),
                () -> assertEquals(medico1.getUniversidade(), medico.getUniversidade())
        );
    }

    static Stream<Arguments> provedorArgumentosMedico(){
        return Stream.of(
                Arguments.arguments(m1),
                Arguments.arguments(m2),
                Arguments.arguments(m3)
        );
    }

    @Test
    @DisplayName("Teste das listas de Medicos")
    @Order(2)
    public void testesListasDeMedicos(){
        Medicos medicos1 = new Medicos();
        Medicos medicos2 = new Medicos();
        Medicos medicos3 = new Medicos();

        medicos1.incluir(m1);
        medicos1.incluir(m2);
        medicos1.incluir(m3);

        medicos1.listarTodos();
        medicos1.listarUm("123456");

        medicos2.incluir(m1);
        medicos2.incluir(m2);
        medicos2.incluir(m3);

        medicos3.incluir(m1);
        medicos3.incluir(m3);
        medicos3.incluir(m2);

        assertAll(
                () -> assertIterableEquals(medicos1.getMedicos(), medicos2.getMedicos(), "Primeira comparação"),
                () -> assertNotSame(medicos2.getMedicos(), medicos3.getMedicos(), "Segunda comparação")
        );

    }

}