import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestCalculadora
{
    //part1
    @Test
    public void AddWithDifferentArguments(){
        int result = calculator.Add(2,5);
        assertEquals(7, result);
    }
    //Como anteriormente el método Dad retorna 4, este Test no pasa está en rojo, porque espera q le retorne 7, entonces debemos 
    //retornar al método Add y generalizar el método para que pase el Test.
    
    //part3
    //
    //Ahora el Test está en estado Green, debemos pasar a refactorizar el código, la manera más simple de identificar es buscar código 
    //duplicado, el cual se encuentra en los test:
    private Calculator calculator;
    public TestCalculadora(){
    }

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown(){
    }
    
    @Test
    public void add(){
        int result = calculator.Add(2,2);
        assertEquals(4, result);
    }
    
    /**
     * @Test
        public void AddWithDifferentArguments(){
        int result = calculator.Add(2,5);
        assertEquals(7, result);
    }
     */
    
    //Realizamos a llamada al constructor de Calculator y se extrae como variable de instancia de la 
    //clase CalculatorTests así eliminando el código duplicado.
    //Usar el SetUp no siempre es la opción correcta. Si cada uno de los tests necesitase de 
    //instancias de la calculadora distintas para funcionar (por ejemplo haciendo llamadas a diferentes versiones de un constructor sobrecargado), sería conveniente crearlas en cada uno de ellos en lugar de en la inicialización.

    //part4
    @Test
    public void SetAnsGetUpperLimit(){
        Calculator calculator = new Calculator(-100,100);
        assertEquals(100, calculator.getUpperLimit());
    }
    //No compila, hay que definir la propiedad UpperLimit en Calculator. Puesto que la propiedad LowerLimit es exáctamente del 
    //mismo tipo que UpperLimit, y así damos el uso de los métodos geters y seter para asignar y recuperar los valores.
    //part 6
    @Test
    public void ArgumentsExceedLimitsOnSubstract(){
        Calculator calculator = new Calculator(-100,100);
        try{
            calculator.Substract(calculator.getUpperLimit() + 1, calculator.getLowerLimit() - 1);
            fail("This should fail: arguments exceed limits");
        }catch (Exception e) {
            // Ok, this works
        }
    }
    //El test no pasa. Lo más rápido sería copiar las líneas de confirmación de la suma  y pégalo en la resta. En realidad, podemos hacerlo, 
    //entonces verifique que pasen las pruebas y verifique que haya un doble que exija refactorizar.
}