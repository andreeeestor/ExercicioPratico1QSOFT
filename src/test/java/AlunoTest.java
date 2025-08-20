package test.java;

import main.java.Aluno;
import main.java.Curso;
import org.junit.jupiter.api.Assertions;
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
        Assertions.assertEquals("João Silva", aluno.getName());
        Assertions.assertEquals(20, aluno.getAge());
        Assertions.assertEquals(curso, aluno.getCourse());
    }

    @Test
    @DisplayName("Teste de atualização de nome")
    public void testUpdateName() {
        String novoNome = "Maria Santos";
        aluno.updateName(novoNome);
        Assertions.assertEquals(novoNome, aluno.getName());
    }

    @Test
    @DisplayName("Teste de setter de idade")
    public void testSetAge() {
        aluno.setAge(25);
        Assertions.assertEquals(25, aluno.getAge());
    }
}