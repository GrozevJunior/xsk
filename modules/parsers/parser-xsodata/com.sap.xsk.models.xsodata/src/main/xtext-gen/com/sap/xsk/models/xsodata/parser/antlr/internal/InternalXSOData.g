/*
 * generated by Xtext 2.18.0
 */
grammar InternalXSOData;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.sap.xsk.models.xsodata.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.sap.xsk.models.xsodata.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.sap.xsk.models.xsodata.services.XSODataGrammarAccess;

}

@parser::members {

 	private XSODataGrammarAccess grammarAccess;

    public InternalXSODataParser(TokenStream input, XSODataGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "XSOData";
   	}

   	@Override
   	protected XSODataGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleXSOData
entryRuleXSOData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXSODataRule()); }
	iv_ruleXSOData=ruleXSOData
	{ $current=$iv_ruleXSOData.current; }
	EOF;

// Rule XSOData
ruleXSOData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getXSODataAccess().getElementsTypeParserRuleCall_0());
			}
			lv_elements_0_0=ruleType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getXSODataRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"com.sap.xsk.models.xsodata.XSOData.Type");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getTypeAccess().getServiceParserRuleCall());
	}
	this_Service_0=ruleService
	{
		$current = $this_Service_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleService
entryRuleService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServiceRule()); }
	iv_ruleService=ruleService
	{ $current=$iv_ruleService.current; }
	EOF;

// Rule Service
ruleService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='service'
		{
			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
		}
		otherlv_1='namespace'
		{
			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getNamespaceKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getServiceAccess().getNameQualifiedNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getServiceRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"com.sap.xsk.models.xsodata.XSOData.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getServiceAccess().getEntitiesEntityParserRuleCall_4_0());
				}
				lv_entities_4_0=ruleEntity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getServiceRule());
					}
					add(
						$current,
						"entities",
						lv_entities_4_0,
						"com.sap.xsk.models.xsodata.XSOData.Entity");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getServiceAccess().getAssociationsAssociationParserRuleCall_5_0());
				}
				lv_associations_5_0=ruleAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getServiceRule());
					}
					add(
						$current,
						"associations",
						lv_associations_5_0,
						"com.sap.xsk.models.xsodata.XSOData.Association");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getNamespaceEntityQualifiedNamespaceParserRuleCall_0_0());
				}
				lv_namespace_0_0=ruleEntityQualifiedNamespace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					set(
						$current,
						"namespace",
						lv_namespace_0_0,
						"com.sap.xsk.models.xsodata.XSOData.EntityQualifiedNamespace");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='::'
		{
			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getColonColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getNameEntityQualifiedNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEntityQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"com.sap.xsk.models.xsodata.XSOData.EntityQualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='as'
		{
			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getAsKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getAliasEntityQualifiedAliasParserRuleCall_4_0());
				}
				lv_alias_4_0=ruleEntityQualifiedAlias
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					set(
						$current,
						"alias",
						lv_alias_4_0,
						"com.sap.xsk.models.xsodata.XSOData.EntityQualifiedAlias");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getNavigatesNavigationParserRuleCall_5_0());
				}
				lv_navigates_5_0=ruleNavigation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"navigates",
						lv_navigates_5_0,
						"com.sap.xsk.models.xsodata.XSOData.Navigation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getCreateEventsCreateEventParserRuleCall_6_0());
				}
				lv_createEvents_6_0=ruleCreateEvent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"createEvents",
						lv_createEvents_6_0,
						"com.sap.xsk.models.xsodata.XSOData.CreateEvent");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getDeleteUsingDeleteUsingParserRuleCall_7_0());
				}
				lv_deleteUsing_7_0=ruleDeleteUsing
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"deleteUsing",
						lv_deleteUsing_7_0,
						"com.sap.xsk.models.xsodata.XSOData.DeleteUsing");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getUpdateUpdateParserRuleCall_8_0());
				}
				lv_update_8_0=ruleUpdate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"update",
						lv_update_8_0,
						"com.sap.xsk.models.xsodata.XSOData.Update");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getSemicolonKeyword_9());
		}
	)
;

// Entry rule entryRuleEntityQualifiedNamespace
entryRuleEntityQualifiedNamespace returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEntityQualifiedNamespaceRule()); }
	iv_ruleEntityQualifiedNamespace=ruleEntityQualifiedNamespace
	{ $current=$iv_ruleEntityQualifiedNamespace.current.getText(); }
	EOF;

// Rule EntityQualifiedNamespace
ruleEntityQualifiedNamespace returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getEntityQualifiedNamespaceAccess().getQualifiedNameParserRuleCall());
	}
	this_QualifiedName_0=ruleQualifiedName
	{
		$current.merge(this_QualifiedName_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleEntityQualifiedName
entryRuleEntityQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEntityQualifiedNameRule()); }
	iv_ruleEntityQualifiedName=ruleEntityQualifiedName
	{ $current=$iv_ruleEntityQualifiedName.current.getText(); }
	EOF;

// Rule EntityQualifiedName
ruleEntityQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getEntityQualifiedNameAccess().getQualifiedNameParserRuleCall());
	}
	this_QualifiedName_0=ruleQualifiedName
	{
		$current.merge(this_QualifiedName_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleEntityQualifiedAlias
entryRuleEntityQualifiedAlias returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEntityQualifiedAliasRule()); }
	iv_ruleEntityQualifiedAlias=ruleEntityQualifiedAlias
	{ $current=$iv_ruleEntityQualifiedAlias.current.getText(); }
	EOF;

// Rule EntityQualifiedAlias
ruleEntityQualifiedAlias returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getEntityQualifiedAliasAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleNavigation
entryRuleNavigation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNavigationRule()); }
	iv_ruleNavigation=ruleNavigation
	{ $current=$iv_ruleNavigation.current; }
	EOF;

// Rule Navigation
ruleNavigation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='navigates'
		{
			newLeafNode(otherlv_0, grammarAccess.getNavigationAccess().getNavigatesKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getNavigationAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNavigationAccess().getAssociationNavigationAssociationParserRuleCall_2_0());
				}
				lv_association_2_0=ruleNavigationAssociation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNavigationRule());
					}
					set(
						$current,
						"association",
						lv_association_2_0,
						"com.sap.xsk.models.xsodata.XSOData.NavigationAssociation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='as'
		{
			newLeafNode(otherlv_3, grammarAccess.getNavigationAccess().getAsKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNavigationAccess().getAliasNavigationAliasParserRuleCall_4_0());
				}
				lv_alias_4_0=ruleNavigationAlias
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNavigationRule());
					}
					set(
						$current,
						"alias",
						lv_alias_4_0,
						"com.sap.xsk.models.xsodata.XSOData.NavigationAlias");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getNavigationAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleNavigationAssociation
entryRuleNavigationAssociation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNavigationAssociationRule()); }
	iv_ruleNavigationAssociation=ruleNavigationAssociation
	{ $current=$iv_ruleNavigationAssociation.current.getText(); }
	EOF;

// Rule NavigationAssociation
ruleNavigationAssociation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getNavigationAssociationAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleNavigationAlias
entryRuleNavigationAlias returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNavigationAliasRule()); }
	iv_ruleNavigationAlias=ruleNavigationAlias
	{ $current=$iv_ruleNavigationAlias.current.getText(); }
	EOF;

// Rule NavigationAlias
ruleNavigationAlias returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getNavigationAliasAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleCreateEvent
entryRuleCreateEvent returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCreateEventRule()); }
	iv_ruleCreateEvent=ruleCreateEvent
	{ $current=$iv_ruleCreateEvent.current.getText(); }
	EOF;

// Rule CreateEvent
ruleCreateEvent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='create'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCreateEventAccess().getCreateKeyword_0());
		}
		kw='events'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCreateEventAccess().getEventsKeyword_1());
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCreateEventAccess().getLeftParenthesisKeyword_2());
		}
		kw='before'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCreateEventAccess().getBeforeKeyword_3());
		}
		this_ID_4=RULE_ID
		{
			$current.merge(this_ID_4);
		}
		{
			newLeafNode(this_ID_4, grammarAccess.getCreateEventAccess().getIDTerminalRuleCall_4());
		}
		kw='.xsjs'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCreateEventAccess().getXsjsKeyword_5());
		}
		kw=':'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCreateEventAccess().getColonKeyword_6());
		}
		this_ID_7=RULE_ID
		{
			$current.merge(this_ID_7);
		}
		{
			newLeafNode(this_ID_7, grammarAccess.getCreateEventAccess().getIDTerminalRuleCall_7());
		}
		kw='.xsjslib'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCreateEventAccess().getXsjslibKeyword_8());
		}
		kw='::'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCreateEventAccess().getColonColonKeyword_9());
		}
		this_ID_10=RULE_ID
		{
			$current.merge(this_ID_10);
		}
		{
			newLeafNode(this_ID_10, grammarAccess.getCreateEventAccess().getIDTerminalRuleCall_10());
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCreateEventAccess().getRightParenthesisKeyword_11());
		}
	)
;

// Entry rule entryRuleDeleteUsing
entryRuleDeleteUsing returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDeleteUsingRule()); }
	iv_ruleDeleteUsing=ruleDeleteUsing
	{ $current=$iv_ruleDeleteUsing.current.getText(); }
	EOF;

// Rule DeleteUsing
ruleDeleteUsing returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='delete'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteUsingAccess().getDeleteKeyword_0());
		}
		kw='using'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteUsingAccess().getUsingKeyword_1());
		}
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getDeleteUsingAccess().getIDTerminalRuleCall_2());
		}
		kw='.xsjs'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteUsingAccess().getXsjsKeyword_3());
		}
		kw=':'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteUsingAccess().getColonKeyword_4());
		}
		this_ID_5=RULE_ID
		{
			$current.merge(this_ID_5);
		}
		{
			newLeafNode(this_ID_5, grammarAccess.getDeleteUsingAccess().getIDTerminalRuleCall_5());
		}
		kw='.xsjslib'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteUsingAccess().getXsjslibKeyword_6());
		}
		kw='::'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteUsingAccess().getColonColonKeyword_7());
		}
		this_ID_8=RULE_ID
		{
			$current.merge(this_ID_8);
		}
		{
			newLeafNode(this_ID_8, grammarAccess.getDeleteUsingAccess().getIDTerminalRuleCall_8());
		}
	)
;

// Entry rule entryRuleUpdate
entryRuleUpdate returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUpdateRule()); }
	iv_ruleUpdate=ruleUpdate
	{ $current=$iv_ruleUpdate.current.getText(); }
	EOF;

// Rule Update
ruleUpdate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='update'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUpdateAccess().getUpdateKeyword_0());
		}
		kw='forbidden'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUpdateAccess().getForbiddenKeyword_1());
		}
	)
;

// Entry rule entryRuleAssociation
entryRuleAssociation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssociationRule()); }
	iv_ruleAssociation=ruleAssociation
	{ $current=$iv_ruleAssociation.current; }
	EOF;

// Rule Association
ruleAssociation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='association'
		{
			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getAssociationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='principal'
		{
			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getPrincipalKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getPrincipalAssociationPrincipalParserRuleCall_3_0());
				}
				lv_principal_3_0=ruleAssociationPrincipal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					set(
						$current,
						"principal",
						lv_principal_3_0,
						"com.sap.xsk.models.xsodata.XSOData.AssociationPrincipal");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getPrincipalKeyAssociationPrincipalKeyParserRuleCall_5_0());
				}
				lv_principalKey_5_0=ruleAssociationPrincipalKey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					set(
						$current,
						"principalKey",
						lv_principalKey_5_0,
						"com.sap.xsk.models.xsodata.XSOData.AssociationPrincipalKey");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getRightParenthesisKeyword_6());
		}
		otherlv_7='multiplicity'
		{
			newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getMultiplicityKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getPrincipalMultiplicityMultiplicityTypeParserRuleCall_8_0());
				}
				lv_principalMultiplicity_8_0=ruleMultiplicityType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					set(
						$current,
						"principalMultiplicity",
						lv_principalMultiplicity_8_0,
						"com.sap.xsk.models.xsodata.XSOData.MultiplicityType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='dependent'
		{
			newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getDependentKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getDependentAssociationDependentParserRuleCall_10_0());
				}
				lv_dependent_10_0=ruleAssociationDependent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					set(
						$current,
						"dependent",
						lv_dependent_10_0,
						"com.sap.xsk.models.xsodata.XSOData.AssociationDependent");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='('
		{
			newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getLeftParenthesisKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getDependentPropertyAssociationDependentPropertyParserRuleCall_12_0());
				}
				lv_dependentProperty_12_0=ruleAssociationDependentProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					set(
						$current,
						"dependentProperty",
						lv_dependentProperty_12_0,
						"com.sap.xsk.models.xsodata.XSOData.AssociationDependentProperty");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=')'
		{
			newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getRightParenthesisKeyword_13());
		}
		otherlv_14='multiplicity'
		{
			newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getMultiplicityKeyword_14());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getDependentMultiplicityMultiplicityTypeParserRuleCall_15_0());
				}
				lv_dependentMultiplicity_15_0=ruleMultiplicityType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					set(
						$current,
						"dependentMultiplicity",
						lv_dependentMultiplicity_15_0,
						"com.sap.xsk.models.xsodata.XSOData.MultiplicityType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_16=';'
		{
			newLeafNode(otherlv_16, grammarAccess.getAssociationAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleAssociationPrincipal
entryRuleAssociationPrincipal returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAssociationPrincipalRule()); }
	iv_ruleAssociationPrincipal=ruleAssociationPrincipal
	{ $current=$iv_ruleAssociationPrincipal.current.getText(); }
	EOF;

// Rule AssociationPrincipal
ruleAssociationPrincipal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getAssociationPrincipalAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleAssociationPrincipalKey
entryRuleAssociationPrincipalKey returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAssociationPrincipalKeyRule()); }
	iv_ruleAssociationPrincipalKey=ruleAssociationPrincipalKey
	{ $current=$iv_ruleAssociationPrincipalKey.current.getText(); }
	EOF;

// Rule AssociationPrincipalKey
ruleAssociationPrincipalKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getAssociationPrincipalKeyAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleAssociationDependent
entryRuleAssociationDependent returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAssociationDependentRule()); }
	iv_ruleAssociationDependent=ruleAssociationDependent
	{ $current=$iv_ruleAssociationDependent.current.getText(); }
	EOF;

// Rule AssociationDependent
ruleAssociationDependent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getAssociationDependentAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleAssociationDependentProperty
entryRuleAssociationDependentProperty returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAssociationDependentPropertyRule()); }
	iv_ruleAssociationDependentProperty=ruleAssociationDependentProperty
	{ $current=$iv_ruleAssociationDependentProperty.current.getText(); }
	EOF;

// Rule AssociationDependentProperty
ruleAssociationDependentProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getAssociationDependentPropertyAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleMultiplicityType
entryRuleMultiplicityType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicityTypeRule()); }
	iv_ruleMultiplicityType=ruleMultiplicityType
	{ $current=$iv_ruleMultiplicityType.current.getText(); }
	EOF;

// Rule MultiplicityType
ruleMultiplicityType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getMultiplicityTypeAccess().getAsteriskKeyword_0());
		}
		    |
		kw='1'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getMultiplicityTypeAccess().getDigitOneKeyword_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
