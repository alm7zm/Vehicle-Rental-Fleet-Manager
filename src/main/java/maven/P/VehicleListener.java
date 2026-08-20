package maven.P;

//means This tells the Java compiler that this interface is strictly intended to 
//hold exactly one abstract method, allowing it to be used with lambdas later.

@FunctionalInterface

public interface VehicleListener {
	public abstract void onReturn(Vehicle v);

}
