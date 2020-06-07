import java.util.Calendar;

public class Revista implements SubjectEditora,Observer{

	Calendar c = Calendar.getInstance();
	Entregavel entrega = new Entregavel();
	int Semana = c.getFirstDayOfWeek();
	
	@Override
	public void Update(Entregavel eEntregavel) {
		// TODO Auto-generated method stub
		
	}
		
	public void AssinaturaSemanal() {
		entrega.MandaAviso("Sua assinatura e SEMANAL \n");
		Update(entrega);
	}
	public void CancelaAssinatura() {
		System.out.print("Sua assinatura foi CANCELADA");
		System.exit(0);
	}
	
	public void iniciar() {
		if (Semana >=7) {
			AssinaturaSemanal();
		
		}
	}
	
}
