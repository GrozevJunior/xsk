/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbti


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class HdbtiStandaloneSetup extends HdbtiStandaloneSetupGenerated {

	def static void doSetup() {
		new HdbtiStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
