import java.util.HashMap;
import java.util.Map;

public class Municipality {
	public String name;
	public HashMap<String, Sector> sectors;
	public Municipality(String name) {
		this.name = name;
		this.sectors = new HashMap<String, Sector>();
	}
	
	public void report(String sectorName, String option, boolean availability) {
		Sector sector = null;
		if(sectors.containsKey(sectorName))
			sector = sectors.get(sectorName);
		else
			sector = new Sector(sectorName);
		if(option.equals("water"))
			sector.water = availability;
		else
			sector.power = availability;
		sectors.put(sectorName, sector);
	}
	
	private String convertBool(boolean bool) {
		return bool? "Yes" : "No";
	}
	
	public void analyze(String option,  String option2) {
		boolean isOp1Water = false;
		boolean isOp2Water = false;
		if(option.equals("water"))
			isOp1Water = true;
		if(option2.equals("water"))
			isOp2Water = true;
		System.out.println("\nAnalyzing: " + this.name);
		System.out.println("Sector | " + (isOp1Water?"Water":"Power") + " | " + (isOp2Water?"Water":"Power"));
		for(Map.Entry<String, Sector> entry : sectors.entrySet()) {
			Sector sector = entry.getValue();
			System.out.println(sector.name + " | " + (isOp1Water?convertBool(sector.water):convertBool(sector.power)) + " | " + (isOp2Water?convertBool(sector.water):convertBool(sector.power)));
		}
	}

	public void analyze(String option) {
		boolean isOp1Water = false;
		if(option.equals("water"))
			isOp1Water = true;
		System.out.println("\nAnalyzing: " + this.name);
		System.out.println("Sector | " + (isOp1Water?"Water":"Power"));
		for(Map.Entry<String, Sector> entry : sectors.entrySet()) {
			Sector sector = entry.getValue();
			System.out.println(sector.name + " | " + (isOp1Water?convertBool(sector.water):convertBool(sector.power)));
		}
	}
}
