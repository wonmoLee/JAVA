package composite;

import lombok.Data;

//�ڹٴ� ���� ����� �ȵ�
@Data
public class BigBurgerSet {
	private BigBurger bigBurger;
	private Coke coke;
	private FrenchFried frenchFried;
	
	public BigBurgerSet() {
		this(
			  new BigBurger(),
			  new Coke(),
			  new FrenchFried()
				);
	}
	
	public BigBurgerSet(BigBurger bigBurger, Coke coke, FrenchFried frenchFried) {
		this.bigBurger = bigBurger;
		this.coke = coke;
		this.frenchFried = frenchFried;
	}
	
	
}