/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbti.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class HdbtiAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/sap/xsk/models/hdbti/parser/antlr/internal/InternalHdbti.tokens");
	}
}
