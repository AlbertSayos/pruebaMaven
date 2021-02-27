package fiuba.algo3.ejemplo1;

import junit.framework.Assert;
import org.junit.Test;

public class FooTest2 {

	@Test
	public void test00AlgoChatVacioNoTieneUsuariosNiCanales(){
		AlgoChat algoChat = new AlgoChat();
		int cantidadDeUsuarios = algoChat.getCantidadDeUsuarios();
		Assert.assertEquals(cantidadDeUsuarios,0);
		
		int cantidadDeCanales = algoChat.getCantidadDeCanales();
		
	}
	
	
	/*
	@Test
	public void doFooShouldReturnFoo(){
        Foo foo = new Foo();
        String result = foo.doFoo();
        Assert.assertEquals("Foo", result);
	}*/
	
	/*
	@Test
	public void doBarShouldReturnBar(){
        Foo foo = new Foo();
        String result = foo.doBar();
        Assert.assertEquals("Bar", result);
	}
	*/

}
