// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MoveState. */
public final class MoveState extends ExpandableStringEnum<MoveState> {
    /** Static value AssignmentPending for MoveState. */
    public static final MoveState ASSIGNMENT_PENDING = fromString("AssignmentPending");

    /** Static value PreparePending for MoveState. */
    public static final MoveState PREPARE_PENDING = fromString("PreparePending");

    /** Static value PrepareInProgress for MoveState. */
    public static final MoveState PREPARE_IN_PROGRESS = fromString("PrepareInProgress");

    /** Static value PrepareFailed for MoveState. */
    public static final MoveState PREPARE_FAILED = fromString("PrepareFailed");

    /** Static value MovePending for MoveState. */
    public static final MoveState MOVE_PENDING = fromString("MovePending");

    /** Static value MoveInProgress for MoveState. */
    public static final MoveState MOVE_IN_PROGRESS = fromString("MoveInProgress");

    /** Static value MoveFailed for MoveState. */
    public static final MoveState MOVE_FAILED = fromString("MoveFailed");

    /** Static value DiscardInProgress for MoveState. */
    public static final MoveState DISCARD_IN_PROGRESS = fromString("DiscardInProgress");

    /** Static value DiscardFailed for MoveState. */
    public static final MoveState DISCARD_FAILED = fromString("DiscardFailed");

    /** Static value CommitPending for MoveState. */
    public static final MoveState COMMIT_PENDING = fromString("CommitPending");

    /** Static value CommitInProgress for MoveState. */
    public static final MoveState COMMIT_IN_PROGRESS = fromString("CommitInProgress");

    /** Static value CommitFailed for MoveState. */
    public static final MoveState COMMIT_FAILED = fromString("CommitFailed");

    /** Static value Committed for MoveState. */
    public static final MoveState COMMITTED = fromString("Committed");

    /** Static value DeleteSourcePending for MoveState. */
    public static final MoveState DELETE_SOURCE_PENDING = fromString("DeleteSourcePending");

    /** Static value ResourceMoveCompleted for MoveState. */
    public static final MoveState RESOURCE_MOVE_COMPLETED = fromString("ResourceMoveCompleted");

    /**
     * Creates or finds a MoveState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MoveState.
     */
    @JsonCreator
    public static MoveState fromString(String name) {
        return fromString(name, MoveState.class);
    }

    /** @return known MoveState values. */
    public static Collection<MoveState> values() {
        return values(MoveState.class);
    }
}