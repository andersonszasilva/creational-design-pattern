package br.com.adesozasilva.gofdesigpatterns.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class LayoutFactoryTest {

	@Test
	public void should_render_materialize_layout() {
		Layout layout = new LayoutFactoryImpl(LayoutType.MATERIALIZE).createLayout();
		String body = layout.createBody();
		String expectedBody= "<html><head></head><body><button class=\"waves-effect\"></button></body></html>";
		
		assertEquals(body, expectedBody);
	}
	
	@Test
	public void should_render_bootstrap_layout() {
		Layout layout = new LayoutFactoryImpl(LayoutType.BOOTSTRAP).createLayout();
		String body = layout.createBody();
		String expectedBody= "<html><head></head><body><button class=\"btn btn-primary\"></button></body></html>";
		
		assertEquals(body, expectedBody);
	}

}
