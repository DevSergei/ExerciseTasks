public class MyArraySizeException extends Exception {
    public MyArraySizeException(){
        super();
    }   
    //We can do smth like this:
    @Override
    public String getMessage() {
        if (idx != -1)
            return "array[" + idx + "].length exceeds the MAX_SIZE of " + iMaxSizeContaining.MAX_SIZE; //super.getMessage();
        else
            return msg;
    }
}
