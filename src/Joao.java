public class Joao extends Pessoas{

	Jornal jornal = new Jornal();
	Entregavel entrega = new Entregavel();
	
	@Override
	public void Update(Entregavel eEntregavel) {
		// TODO Auto-generated method stub
		jornal.AssinaturaFinaisDeSemana();
	}

	
}
