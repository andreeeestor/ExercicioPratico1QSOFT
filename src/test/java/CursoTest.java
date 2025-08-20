package test.java;

import main.java.Curso;
import main.java.Disciplina;
import org.junit.jupiter.api.Assertions;
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
        Assertions.assertEquals("Ciência da Computação", curso.getName());
        Assertions.assertEquals("Matutino", curso.getTime());
        Assertions.assertTrue(curso.getDisciplines().isEmpty());
    }
    
    @Test
    @DisplayName("Teste de adição de disciplina")
    public void testAddDiscipline() {
        curso.addDiscipline(disciplina);
        Assertions.assertEquals(1, curso.getDisciplines().size());
        Assertions.assertTrue(curso.getDisciplines().contains(disciplina));
    }
    
    @Test
    @DisplayName("Teste de múltiplas disciplinas")
    public void testMultiplasDisciplinas() {
        Disciplina disciplina2 = new Disciplina("Banco de Dados", 80, 8.0);
        
        curso.addDiscipline(disciplina);
        curso.addDiscipline(disciplina2);
        
        Assertions.assertEquals(2, curso.getDisciplines().size());
    }
}