package jo.secondstep.solid.liskovsubstitution.correct;

public interface Car {
	
	public void provideEnergy(EnergyProvider energyProvider, int time);

	public void startEngine();

	public void stopEngine();
}
