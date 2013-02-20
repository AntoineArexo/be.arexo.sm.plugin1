package be.arexo.sm

import org.codehaus.groovy.grails.commons.DefaultGrailsApplication;
import org.codehaus.groovy.grails.exceptions.GrailsConfigurationException;
import org.codehaus.groovy.grails.plugins.DomainClassGrailsPlugin;

class MyController {
	def index(){

		DefaultGrailsApplication
		DomainClassGrailsPlugin
		render "Top controller!jdsk"

	}
	
	def other(){
		render "other or what! "
	}
}
