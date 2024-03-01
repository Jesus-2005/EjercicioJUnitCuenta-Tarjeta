package es.iessoterohernandez.daw.endes.EjerciciosJUnitCuenta_Tarjeta;

import java.util.Date;

public class Debito extends Tarjeta
{
	public Debito(String numero, String titular, Date fechaCaducidad)
	{
		super(numero, titular, fechaCaducidad);
	}
	
	public void retirar(double x) throws Exception 
	{
		this.mCuentaAsociada.retirar("Retirada en cajero autom�tico", x);
	}
	
	public void ingresar(double x) throws Exception 
	{
		this.mCuentaAsociada.ingresar(x);
	}
	
	public void pagoEnEstablecimiento(String datos, double x) throws Exception 
	{
		this.mCuentaAsociada.retirar("Compra en :" + datos, x);
	}
	
	public double getSaldo() 
	{
		return mCuentaAsociada.getSaldo();
	}
}