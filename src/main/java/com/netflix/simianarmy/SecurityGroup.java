package com.netflix.simianarmy;

public interface SecurityGroup {

	/**
	 * Finds a security group with the given name, that can be applied to the given instance.
	 *
	 * For example, if it is a VPC instance, it makes sure that it is in the same VPC group.
	 *
	 * @param instanceId
	 *            the instance that the group must be applied to
	 * @param groupName
	 *            the name of the group to find
	 *
	 * @return The group id, or null if not found
	 */
	public abstract String findSecurityGroup(String instanceId, String groupName);

	/**
	 * Creates an (empty) security group, that can be applied to the given instance.
	 *
	 * @param instanceId
	 *            instance that group should be applicable to
	 * @param groupName
	 *            name for new group
	 * @param description
	 *            description for new group
	 *
	 * @return the id of the security group
	 */
	public abstract String createSecurityGroup(String instanceId,
			String groupName, String description);

	/**
	 * Checks if we can change the security groups of an instance.
	 *
	 * @param instanceId
	 *            instance to check
	 *
	 * @return true iff we can change security groups.
	 */
	public abstract boolean canChangeInstanceSecurityGroups(String instanceId);

}