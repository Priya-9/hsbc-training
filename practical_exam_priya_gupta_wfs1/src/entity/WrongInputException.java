package entity;

public class WrongInputException extends RuntimeException{
	public String toString() {
		return ("You entered Wrong Number. Enter from the given Choices");
	}
}
