public class Jose extends Pessoas{

	Jornal jornal = new Jornal();
	@Override
	public void Update(Entregavel eEntregavel) {
		// TODO Auto-generated method stub
		jornal.AssinaturaDiaria();
		jornal.AssinaturaFinaisDeSemana();
	}

}
