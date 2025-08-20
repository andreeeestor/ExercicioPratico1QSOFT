import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class DisciplinaTest {
    
    private Disciplina disciplina;
    
    @BeforeEach
    public void setUp() {
        disciplina = new Disciplina("Programação Java", 80, 8.5);
    }
    
    @Test
    @DisplayName("Teste de criação de disciplina")
    public void testCriarDisciplina() {
        assertEquals("Programação Java", disciplina.getName());
        assertEquals(80, disciplina.getWorkload());
        assertEquals(8.5, disciplina.getGrade(), 0.01);
    }
    
    @Test
    @DisplayName("Teste campo name público")
    public void testCampoNamePublico() {
        disciplina.name = "Nome alterado diretamente";
        assertEquals("Nome alterado diretamente", disciplina.name);
    }
    
    @Test
    @DisplayName("Teste de nota válida")
    public void testSetGrade() {
        disciplina.setGrade(9.0);
        assertEquals(9.0, disciplina.getGrade(), 0.01);
    }
}