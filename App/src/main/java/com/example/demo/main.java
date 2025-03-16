package com.example.demo;

import com.repoGAA.descuento.Descuento;
import com.repoGAA.evento.Eventos;
import com.repoGAA.pago.Pago;
import com.repoGAA.ticket.Ticket;
import com.repoGAA.tipoTicket.tipoTicket;
import com.repoGAA.usuarios.Usuarios;

public class main {

	public static void main(String[] args) {

		//User List
		Usuarios usuario1 = new Usuarios("Juan Perez", "12345678A", "juan@example.com", 123456789);
		Usuarios usuario2 = new Usuarios("Maria Lopez", "87654321B", "maria@example.com", 987654321);
		Usuarios usuario3 = new Usuarios("Carlos Gomez", "56781234C", "carlos@example.com", 567812345);
		
		//Event List
		Eventos evento1 = new Eventos("Madrid", 20, "Techno", 50);
		Eventos evento2 = new Eventos("Barcelona", 22, "Rock", 100);
		Eventos evento3 = new Eventos("Valencia", 19, "Jazz", 75);
		
		//Ticket List
		Ticket ticket1 = new Ticket(20, "Madrid", 12345, "VIP_1");
		Ticket ticket2 = new Ticket(22, "Barcelona", 67890, "VIP_2");
		Ticket ticket3 = new Ticket(19, "Valencia", 54321, "General");
		
		//Ticket List Type
		tipoTicket tipoTicket1 = new tipoTicket("VIP_1", 100);
		tipoTicket tipoTicket2 = new tipoTicket("VIP_2", 75);
		tipoTicket tipoTicket3 = new tipoTicket("General", 50);
		
		//Buy Type
		Pago pago1 = new Pago("1234-5678-9012-3456", 0, "678901234", "juan@example.com");
		Pago pago2 = new Pago(null, 50, null, null); // Pago en efectivo
		Pago pago3 = new Pago(null, 0, "678901235", null); // Pago con Bizum
		
		//Discount
		Descuento descuento1 = new Descuento(100, 10); // 10% de descuento
		Descuento descuento2 = new Descuento(200, 20); // 20% de descuento
		Descuento descuento3 = new Descuento(50, 5);  // 5% de descuento
		
		// Interacción
		
		//Usuario 1
		usuario1.BuscarEvento("Techno");
		evento1.CrearEvento();
		tipoTicket1.elegirTipo();
		double costoConDescuento = tipoTicket1.getCosto() - descuento1.descuentoTotal(tipoTicket1.getCosto());
		System.out.println("Costo con descuento: " + costoConDescuento);
		pago1.ProcesarPago(costoConDescuento);
		ticket1.AnularTicket();
		
		//Usuario 2
		usuario2.BuscarEvento("Rock");
		evento2.CrearEvento();
		tipoTicket2.elegirTipo();
		pago2.ProcesarPago(costoConDescuento);
		ticket2.AnularTicket();
		
		//Usuario 3
		usuario3.BuscarEvento("Jazz");
		evento3.CrearEvento();
		tipoTicket3.elegirTipo();
		double costoConDescuento1 = tipoTicket3.getCosto() - descuento3.descuentoTotal(tipoTicket3.getCosto());
		System.out.println("Costo con descuento: " + costoConDescuento1);
		pago3.ProcesarPago(costoConDescuento1);
		ticket3.ComprarTicket();
		System.out.println("Puntos acumulados: " + descuento3.getPuntos());
		
		
	}

}
