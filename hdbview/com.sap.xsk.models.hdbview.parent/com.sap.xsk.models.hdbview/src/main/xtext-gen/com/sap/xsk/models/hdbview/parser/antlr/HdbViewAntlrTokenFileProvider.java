/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbview.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class HdbViewAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/sap/xsk/models/hdbview/parser/antlr/internal/InternalHdbView.tokens");
	}
}
