// Class to represent the chemical species being modelled
public class Species {
	private Double concentration = 0.0;
	private Double amount = 0.0;
	private Integer z = 1;
	public Species() {
		
	}
	public void set_z(int z) {
		this.z = z;
	}
	public Double getConcentration() {
		return this.concentration;
	}
}