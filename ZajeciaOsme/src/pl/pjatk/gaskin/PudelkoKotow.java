package pl.pjatk.gaskin;

/**
 * Created by Gaskin on 06.12.2016.
 */
public class PudelkoKotow implements Comparable<PudelkoKotow>{

	int pojemnoscKotowatosci;

	public PudelkoKotow(int pojemnoscKotowatosci){
		this.pojemnoscKotowatosci=pojemnoscKotowatosci;
	}


	@Override
	public int compareTo(PudelkoKotow o) {
		if (o.pojemnoscKotowatosci > this.pojemnoscKotowatosci) return 1;
		else if (o.pojemnoscKotowatosci < this.pojemnoscKotowatosci) return -1;
		return 0;
	}



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof PudelkoKotow)) return false;

		PudelkoKotow that = (PudelkoKotow) o;

		return pojemnoscKotowatosci == that.pojemnoscKotowatosci;
	}

	@Override
	public int hashCode() {
		return pojemnoscKotowatosci;
	}


}
