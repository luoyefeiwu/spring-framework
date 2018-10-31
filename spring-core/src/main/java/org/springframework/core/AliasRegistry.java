/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.core;

/**
 * ���ڹ��������ͨ�ý��档 ��Ϊ�����ӿڣ�
 * Common interface for managing aliases. Serves as super-interface for
 * {@link org.springframework.beans.factory.support.BeanDefinitionRegistry}.
 *
 * @author Juergen Hoeller
 * @since 2.5.2
 */
public interface AliasRegistry {

	/**
	 * ��������,Ϊ��ע�������
	 * Given a name, register an alias for it.
	 * @param name �����淶����   the canonical name
	 * @param alias Ҫע��ı���  the alias to be registered
	 * @throws �����������Ѿ���ʹ��,����IllegalStateException�쳣  IllegalStateException if the alias is already in use
	 * ���ҿ��ܲ��ᱻ����  and may not be overridden
	 */
	void registerAlias(String name, String alias);

	/**
	 * �Ӵ�ע�����ɾ��ָ���ı��� Remove the specified alias from this registry.
	 * @param alias Ҫɾ���ı���  the alias to remove
	 * @throws ���û���ҵ������ı���,����IllegalStateException�쳣  IllegalStateException if no such alias was found
	 */
	void removeAlias(String alias);

	/** 
	 * ȷ���˸��������Ƿ���Ϊ����  Determine whether this given name is defines as an alias
	 * (������ʵ��ע������������  as opposed to the name of an actually registered component).
	 * @param name Ҫ�������� the name to check
	 * @return �����������Ƿ�Ϊ���� whether the given name is an alias
	 */
	boolean isAlias(String name);

	/**
	 * ����Ѷ��壬�򷵻ظ����ı��� Return the aliases for the given name, if defined.
	 * @param name Ҫ���ı������� the name to check for aliases
	 * @return ���������û�з��ؿ�����  the aliases, or an empty array if none
	 */
	String[] getAliases(String name);

}
