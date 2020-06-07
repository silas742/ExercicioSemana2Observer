import java.util.Calendar;
// biblioteca calendar como solicitado.
public class Jornal implements SubjectEditora,Observer {
	
	Entregavel entrega = new Entregavel();
	Calendar c = Calendar.getInstance();
	int dia =c.getFirstDayOfWeek();
	int FinalDeSemana = c.getFirstDayOfWeek();
	@Override
	public void Update(Entregavel eEntregavel) {
		// TODO Auto-generated method stub		
	}

	public void AssinaturaDiaria() {
		entrega.MandaAviso("Sua assinatura e DIARIA \n");
		Update(entrega);
	}
	public void AssinaturaFinaisDeSemana() {
		entrega.MandaAviso("Sua assinatura e aos FINAIS DE SEMANA \n");
		Update(entrega);
	}
	
	
	
	public void CancelaAssinatura() {
		System.out.print("Sua assinatura foi CANCELADA");
		System.exit(0);
	}
	
	public void iniciar() {
		if (dia !=0) {
			AssinaturaDiaria();
		
		}
	}
	
}
