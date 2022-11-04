public class Calculator{
    //part2
    public int Add(int arg1, int arg2){
        return  arg1+arg2;
    }
    // Este metodo no devuelve 7 porque el anterior test dejara de funcionar, por lo cual ganeralizamos el
    //método para cualquier valor que se ingrese
    
    //part5
    private int upperLimit;
    private int lowerLimit;
    
    public Calculator(int max, int min){
        upperLimit = max;
        lowerLimit = min;
    }
    
    public void setLowerLimit(int value){
        this.lowerLimit=value;
    }
    
    public void setUpperLimit(int value){
        this.upperLimit= value;
    }
    
    public int getUpperLimit(){
        return this.upperLimit;
    }
    
    public int getLowerLimit(){
        return this.lowerLimit;
    }
    //Seguidamente modificamos el último test que estábamos trabajando y lo cambiamos
    //de nombre con el cual obtenemos tanto el límite superior y el inferior donde se
    //implementa dos assert que hacen lo mismo.
    
    //part 7
    public boolean validateArgs(int arg1, int arg2){
        if(arg1 > upperLimit){
            throw new RuntimeException("First argument exceeds upper limit");
        }
        if(arg2 < lowerLimit){
            throw new RuntimeException("First argument exceeds lower limit");
        }
        if(arg1 < lowerLimit){
            throw new RuntimeException("Second argument exceeds lower limit");
        }
        if(arg1 < upperLimit){
            throw new RuntimeException("Second argument exceeds upper limit");
        }
        return true;
    }
    
    public int Add(int arg1, int arg2) {
        validateArgs(arg1, arg2);
        int result = arg1 + arg2;
        if (result > upperLimit)
        {
            throw new RuntimeException("Upper limit exceeded");
        }
        return result;
    }
    
    public int Substract(int arg1, int arg2){
        validateArgs(arg1, arg2);
        int result = arg1 - arg2;
        if (result < lowerLimit){
            throw new RuntimeException("Lower limit exceeded");
        }
        return result;
    }
    //los test Pasan
}