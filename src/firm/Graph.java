/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_irgraph;
import firm.nodes.Node;

/**
 * A graph is an object owning stuff related to a firm graph. That is:
 *
 * - Nodes and Blocks
 * - A type describing the stackframe layout
 * - Direct pointers to some unique nodes (StartBlock, Start, ...)
 * - Helper functions to traverse the graph
 */
public class Graph extends GraphBase {

	public Graph(Pointer pointer) {
		super(pointer);
	}

	/**
	 * create a new firm graph.
	 * You have to specify the number of parameters, you want to use during
	 * graph construction (for Construction.setVariable/Construction.getVariable)
	 * @param entity      Entity for the graph (an entity with MethodType)
	 * @param nLocalVars  number of local variables during graph construction
	 */
	public Graph(Entity entity, int nLocalVars) {
		this(binding_irgraph.new_ir_graph(entity.ptr, nLocalVars));
	}



	/** Create a new Add node */
	public final Node newAdd(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Add(block.ptr, left.ptr, right.ptr, mode.ptr));
	}

	/** Create a new Address node */
	public final Node newAddress(firm.Entity entity) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Address(this.ptr, entity.ptr));
	}

	/** Create a new Align node */
	public final Node newAlign(firm.Mode mode, firm.Type type) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Align(this.ptr, mode.ptr, type.ptr));
	}

	/** Create a new Alloc node */
	public final Node newAlloc(Node block, Node mem, Node size, int alignment) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Alloc(block.ptr, mem.ptr, size.ptr, alignment));
	}

	/** Create a new And node */
	public final Node newAnd(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_And(block.ptr, left.ptr, right.ptr, mode.ptr));
	}

	/** Create a new Bad node */
	public final Node newBad(firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Bad(this.ptr, mode.ptr));
	}

	/** Create a new Bitcast node */
	public final Node newBitcast(Node block, Node op, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Bitcast(block.ptr, op.ptr, mode.ptr));
	}

	/** Create a new Block node */
	public final Node newBlock(Node[] ins) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Block(this.ptr, ins.length, Node.getBufferFromNodeList(ins)));
	}

	/** Create a new Builtin node */
	public final Node newBuiltin(Node block, Node mem, Node[] ins, firm.bindings.binding_ircons.ir_builtin_kind kind, firm.Type type) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Builtin(block.ptr, mem.ptr, ins.length, Node.getBufferFromNodeList(ins), kind.val, type.ptr));
	}

	/** Create a new Call node */
	public final Node newCall(Node block, Node mem, Node _ptr, Node[] ins, firm.Type type) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Call(block.ptr, mem.ptr, _ptr.ptr, ins.length, Node.getBufferFromNodeList(ins), type.ptr));
	}

	/** Create a new Cmp node */
	public final Node newCmp(Node block, Node left, Node right, firm.Relation relation) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Cmp(block.ptr, left.ptr, right.ptr, relation.value()));
	}

	/** Create a new Cond node */
	public final Node newCond(Node block, Node selector) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Cond(block.ptr, selector.ptr));
	}

	/** Create a new Confirm node */
	public final Node newConfirm(Node block, Node value, Node bound, firm.Relation relation) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Confirm(block.ptr, value.ptr, bound.ptr, relation.value()));
	}

	/** Create a new Const node */
	public final Node newConst(firm.TargetValue tarval) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Const(this.ptr, tarval.ptr));
	}

	/** Create a new Conv node */
	public final Node newConv(Node block, Node op, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Conv(block.ptr, op.ptr, mode.ptr));
	}

	/** Create a new CopyB node */
	public final Node newCopyB(Node block, Node mem, Node dst, Node src, firm.Type type, firm.bindings.binding_ircons.ir_cons_flags flags) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_CopyB(block.ptr, mem.ptr, dst.ptr, src.ptr, type.ptr, flags.val));
	}

	/** Create a new Div node */
	public final Node newDiv(Node block, Node mem, Node left, Node right, firm.Mode resmode, firm.bindings.binding_ircons.op_pin_state pin_state) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Div(block.ptr, mem.ptr, left.ptr, right.ptr, resmode.ptr, pin_state.val));
	}

	/** Create a new Dummy node */
	public final Node newDummy(firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Dummy(this.ptr, mode.ptr));
	}

	/** Create a new End node */
	public final Node newEnd(Node[] ins) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_End(this.ptr, ins.length, Node.getBufferFromNodeList(ins)));
	}

	/** Create a new Eor node */
	public final Node newEor(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Eor(block.ptr, left.ptr, right.ptr, mode.ptr));
	}

	/** Create a new Free node */
	public final Node newFree(Node block, Node mem, Node _ptr) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Free(block.ptr, mem.ptr, _ptr.ptr));
	}

	/** Create a new IJmp node */
	public final Node newIJmp(Node block, Node target) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_IJmp(block.ptr, target.ptr));
	}

	/** Create a new Id node */
	public final Node newId(Node block, Node pred, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Id(block.ptr, pred.ptr, mode.ptr));
	}

	/** Create a new Jmp node */
	public final Node newJmp(Node block) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Jmp(block.ptr));
	}

	/** Create a new Load node */
	public final Node newLoad(Node block, Node mem, Node _ptr, firm.Mode load_mode, firm.Type type, firm.bindings.binding_ircons.ir_cons_flags flags) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Load(block.ptr, mem.ptr, _ptr.ptr, load_mode.ptr, type.ptr, flags.val));
	}

	/** Create a new Member node */
	public final Node newMember(Node block, Node _ptr, firm.Entity entity) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Member(block.ptr, _ptr.ptr, entity.ptr));
	}

	/** Create a new Minus node */
	public final Node newMinus(Node block, Node op, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Minus(block.ptr, op.ptr, mode.ptr));
	}

	/** Create a new Mod node */
	public final Node newMod(Node block, Node mem, Node left, Node right, firm.Mode resmode, firm.bindings.binding_ircons.op_pin_state pin_state) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Mod(block.ptr, mem.ptr, left.ptr, right.ptr, resmode.ptr, pin_state.val));
	}

	/** Create a new Mul node */
	public final Node newMul(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Mul(block.ptr, left.ptr, right.ptr, mode.ptr));
	}

	/** Create a new Mulh node */
	public final Node newMulh(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Mulh(block.ptr, left.ptr, right.ptr, mode.ptr));
	}

	/** Create a new Mux node */
	public final Node newMux(Node block, Node sel, Node _false, Node _true, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Mux(block.ptr, sel.ptr, _false.ptr, _true.ptr, mode.ptr));
	}

	/** Create a new NoMem node */
	public final Node newNoMem() {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_NoMem(this.ptr));
	}

	/** Create a new Not node */
	public final Node newNot(Node block, Node op, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Not(block.ptr, op.ptr, mode.ptr));
	}

	/** Create a new Offset node */
	public final Node newOffset(firm.Mode mode, firm.Entity entity) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Offset(this.ptr, mode.ptr, entity.ptr));
	}

	/** Create a new Or node */
	public final Node newOr(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Or(block.ptr, left.ptr, right.ptr, mode.ptr));
	}

	/** Create a new Phi node */
	public final Node newPhi(Node block, Node[] ins, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Phi(block.ptr, ins.length, Node.getBufferFromNodeList(ins), mode.ptr));
	}

	/** Create a new Pin node */
	public final Node newPin(Node block, Node op) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Pin(block.ptr, op.ptr));
	}

	/** Create a new Proj node */
	public final Node newProj(Node pred, firm.Mode mode, int num) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Proj(pred.ptr, mode.ptr, num));
	}

	/** Create a new Raise node */
	public final Node newRaise(Node block, Node mem, Node exo_ptr) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Raise(block.ptr, mem.ptr, exo_ptr.ptr));
	}

	/** Create a new Return node */
	public final Node newReturn(Node block, Node mem, Node[] ins) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Return(block.ptr, mem.ptr, ins.length, Node.getBufferFromNodeList(ins)));
	}

	/** Create a new Sel node */
	public final Node newSel(Node block, Node _ptr, Node index, firm.Type type) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Sel(block.ptr, _ptr.ptr, index.ptr, type.ptr));
	}

	/** Create a new Shl node */
	public final Node newShl(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Shl(block.ptr, left.ptr, right.ptr, mode.ptr));
	}

	/** Create a new Shr node */
	public final Node newShr(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Shr(block.ptr, left.ptr, right.ptr, mode.ptr));
	}

	/** Create a new Shrs node */
	public final Node newShrs(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Shrs(block.ptr, left.ptr, right.ptr, mode.ptr));
	}

	/** Create a new Size node */
	public final Node newSize(firm.Mode mode, firm.Type type) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Size(this.ptr, mode.ptr, type.ptr));
	}

	/** Create a new Start node */
	public final Node newStart() {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Start(this.ptr));
	}

	/** Create a new Store node */
	public final Node newStore(Node block, Node mem, Node _ptr, Node value, firm.Type type, firm.bindings.binding_ircons.ir_cons_flags flags) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Store(block.ptr, mem.ptr, _ptr.ptr, value.ptr, type.ptr, flags.val));
	}

	/** Create a new Sub node */
	public final Node newSub(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Sub(block.ptr, left.ptr, right.ptr, mode.ptr));
	}

	/** Create a new Switch node */
	public final Node newSwitch(Node block, Node selector, int n_outs, Pointer table) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Switch(block.ptr, selector.ptr, n_outs, table));
	}

	/** Create a new Sync node */
	public final Node newSync(Node block, Node[] ins) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Sync(block.ptr, ins.length, Node.getBufferFromNodeList(ins)));
	}

	/** Create a new Tuple node */
	public final Node newTuple(Node block, Node[] ins) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Tuple(block.ptr, ins.length, Node.getBufferFromNodeList(ins)));
	}

	/** Create a new Unknown node */
	public final Node newUnknown(firm.Mode mode) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_Unknown(this.ptr, mode.ptr));
	}
}
