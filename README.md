# Lumus
Programming Languages Project

## CONSTANTS
* option: power, water
* boolean: yes, no

## DATA TYPES
* Municipality
* * Name - String
* * Sectors - Map<String, Sector>

* Sector
* * Name - String
* * Power - boolean
* * Water - boolean
	
* Region
* * Municipalities - List<Municipality>

## COMMANDS
* municipality <municipality> = “<municipality name>”
* analyze(<municipality identifier>,[option])
* analyze(<municipality identifier>,[option],[option])
* report(<municipality identifier>,”<sector name>”,[option],[availability])
* showstatistics(<municipality identifier>)

* region <region identifier>
* addmunucipality(<region identifier>, <municipality identifier>)
* showstatistics(<region identifier>)

## Example Program:
`municipality m = “Mayaguez”`
`report(m, “Miradero”, water, yes)`
`report(m, “Terrace”, power, yes)`
`report(m, “Terrace”, water, yes)`
`region r`
`addmunucipality(r, m)`
`report(m, “Miradero”, power, no)`
`showstatistics(r)`
`showstatistics(m)`
`municipality m = “Cabo Rojo”`