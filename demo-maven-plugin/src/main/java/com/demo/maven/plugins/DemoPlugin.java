package com.demo.maven.plugins;

import java.io.IOException;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name="demo",defaultPhase = LifecyclePhase.INITIALIZE)
public class DemoPlugin extends AbstractMojo{

	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Hello from Demo Plugin");
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
