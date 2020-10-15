/*
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbview.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.sap.xsk.models.hdbview.ide.contentassist.antlr.internal.InternalHdbViewParser;
import com.sap.xsk.models.hdbview.services.HdbViewGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class HdbViewParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(HdbViewGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, HdbViewGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getViewAccess().getGroup_0(), "rule__View__Group_0__0");
			builder.put(grammarAccess.getViewAccess().getGroup_1(), "rule__View__Group_1__0");
			builder.put(grammarAccess.getViewAccess().getGroup_2(), "rule__View__Group_2__0");
			builder.put(grammarAccess.getViewAccess().getGroup_2_3(), "rule__View__Group_2_3__0");
			builder.put(grammarAccess.getViewAccess().getGroup_2_3_1(), "rule__View__Group_2_3_1__0");
			builder.put(grammarAccess.getHdbViewModelAccess().getViewElementAssignment(), "rule__HdbViewModel__ViewElementAssignment");
			builder.put(grammarAccess.getViewAccess().getSchemaAssignment_0_0(), "rule__View__SchemaAssignment_0_0");
			builder.put(grammarAccess.getViewAccess().getSchemaNameAssignment_0_2(), "rule__View__SchemaNameAssignment_0_2");
			builder.put(grammarAccess.getViewAccess().getQueryAssignment_1_0(), "rule__View__QueryAssignment_1_0");
			builder.put(grammarAccess.getViewAccess().getQueryValueAssignment_1_2(), "rule__View__QueryValueAssignment_1_2");
			builder.put(grammarAccess.getViewAccess().getDependsOnAssignment_2_0(), "rule__View__DependsOnAssignment_2_0");
			builder.put(grammarAccess.getViewAccess().getDependsOnValuesAssignment_2_3_0(), "rule__View__DependsOnValuesAssignment_2_3_0");
			builder.put(grammarAccess.getViewAccess().getDependsOnValuesAssignment_2_3_1_1(), "rule__View__DependsOnValuesAssignment_2_3_1_1");
			builder.put(grammarAccess.getViewAccess().getUnorderedGroup(), "rule__View__UnorderedGroup");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private HdbViewGrammarAccess grammarAccess;

	@Override
	protected InternalHdbViewParser createParser() {
		InternalHdbViewParser result = new InternalHdbViewParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public HdbViewGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HdbViewGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
