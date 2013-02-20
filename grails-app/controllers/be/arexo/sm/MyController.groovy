package be.arexo.sm

import org.codehaus.groovy.grails.commons.DefaultGrailsApplication;
import org.codehaus.groovy.grails.exceptions.GrailsConfigurationException;

class MyController {
	def index(){

		DefaultGrailsApplication
		render "Top controller!jdsk"

	}
	
	def other(){
		render "other or what! "
	}
}
