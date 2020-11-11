/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbti.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.sap.xsk.models.hdbti.HdbtiRuntimeModule;
import com.sap.xsk.models.hdbti.HdbtiStandaloneSetup;
import com.sap.xsk.models.hdbti.ide.HdbtiIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class HdbtiIdeSetup extends HdbtiStandaloneSetup {
  @Override
  public Injector createInjector() {
    HdbtiRuntimeModule _hdbtiRuntimeModule = new HdbtiRuntimeModule();
    HdbtiIdeModule _hdbtiIdeModule = new HdbtiIdeModule();
    return Guice.createInjector(Modules2.mixin(_hdbtiRuntimeModule, _hdbtiIdeModule));
  }
}