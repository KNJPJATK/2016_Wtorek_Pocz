package pl.pjatk.gaskin.EnumExample;

/**
 * Created by Gaskin on 29.11.2016.
 */
public enum Level {
	HIGH  (3,1),  //wzywa konstruktor z wartością 3
	MEDIUM(2,2),  //wzywa konstruktor z wartością 2
	LOW   (1,3)   //wzywa kontruktor z watością 1
	; // średnik - potrzebny gdy mamy pola lub metody w danym enumie

	private final int levelCode;
	public int druga;


	Level(int levelCode, int druga) {
		this.levelCode = levelCode;
		this.druga = druga;
	}

	public int getLevelCode() {
		return this.levelCode;
	}

}