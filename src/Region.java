import java.util.HashMap;
import java.util.Map;

public class Region {
	public String name;
	public HashMap<String, Municipality> municipalities;
	public Region(String name) {
		this.name = name;
		this.municipalities = new HashMap<String, Municipality>();
	}
	
	public void addmunicipality(Municipality mun){
		if(!municipalities.containsKey(mun.getName())){
			municipalities.put(mun.getName(), mun);
		}else{
			System.out.println("Municipality " + mun.getName() + " is already added.");
		}
	}

	public void showStatistics() {
		double water = 0, power = 0;
		double nos = 0;
		for(Map.Entry<String, Municipality> entry1 : municipalities.entrySet()) {
			Municipality mun = entry1.getValue();
			nos = 0; water = 0; power = 0;
			System.out.println(mun.name);
			for(Map.Entry<String, Sector> entry : mun.sectors.entrySet()) {
				Sector sector = entry.getValue();
				//System.out.println(sector.name);
				if(sector.power)
					power++;
				if(sector.water)
					water++;
				nos++;
			}
			System.out.println("Water:" + String.format("%.2f", (water/nos)*100) +"% Power: "+ String.format("%.2f", (power/nos)*100)+"%" );
			
			
		}
	}
	
	
}
	
	