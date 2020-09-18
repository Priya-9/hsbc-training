package Balance;

public class LowBalanceException extends RuntimeException{
	public String toString() {
		return "Ur Bank account is less than the amount u want";
	}
}
