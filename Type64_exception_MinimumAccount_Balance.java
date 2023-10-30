package Aniket;

public class Type64_exception_MinimumAccount_Balance extends Exception
{
    String message;
    public Type64_exception_MinimumAccount_Balance(String message)
    {
        this.message = message;
    }
    @Override
    public String toString()
    {
        return message;
    }

}
