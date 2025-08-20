import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
    
    private Aluno aluno;
    private Curso curso;
    
    @BeforeEach
    public void setUp() {
        curso = new Curso("Engenharia de Software", "Noturno");
        aluno = new Aluno("João Silva", 20, curso);
    }
    
    @Test
    @DisplayName("Teste de criação de aluno")
    public void testCriarAluno() {
        assertEquals("João Silva", aluno.getName());
        assertEquals(20, aluno.getAge());
        assertEquals(curso, aluno.getCourse());
    }
    
    @Test
    @DisplayName("Teste de atualização de nome")
    public void testUpdateName() {
        String novoNome = "Maria Santos";
        aluno.updateName(novoNome);
        assertEquals(novoNome, aluno.getName());
    }
    
    @Test
    @DisplayName("Teste de setter de idade")
    public void testSetAge() {
        aluno.setAge(25);
        assertEquals(25, aluno.getAge());
    }
}