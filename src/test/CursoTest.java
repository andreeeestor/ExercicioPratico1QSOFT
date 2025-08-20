import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {
    
    private Curso curso;
    private Disciplina disciplina;
    
    @BeforeEach
    public void setUp() {
        curso = new Curso("Ciência da Computação", "Matutino");
        disciplina = new Disciplina("Algoritmos", 60, 7.5);
    }
    
    @Test
    @DisplayName("Teste de criação de curso")
    public void testCriarCurso() {
        assertEquals("Ciência da Computação", curso.getName());
        assertEquals("Matutino", curso.getTime());
        assertTrue(curso.getDisciplines().isEmpty());
    }
    
    @Test
    @DisplayName("Teste de adição de disciplina")
    public void testAddDiscipline() {
        curso.addDiscipline(disciplina);
        assertEquals(1, curso.getDisciplines().size());
        assertTrue(curso.getDisciplines().contains(disciplina));
    }
    
    @Test
    @DisplayName("Teste de múltiplas disciplinas")
    public void testMultiplasDisciplinas() {
        Disciplina disciplina2 = new Disciplina("Banco de Dados", 80, 8.0);
        
        curso.addDiscipline(disciplina);
        curso.addDiscipline(disciplina2);
        
        assertEquals(2, curso.getDisciplines().size());
    }
}