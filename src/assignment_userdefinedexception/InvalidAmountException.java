package assignment_userdefinedexception;

//Custom Exception: Thrown when deposit/withdraw amount is invalid
@SuppressWarnings("serial")
class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}