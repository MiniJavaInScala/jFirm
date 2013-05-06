/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Alloc extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Alloc(ptr);
		}
	}

	static void init() {
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_Alloc.val, new Factory());
	}

	public Alloc(Pointer ptr) {
		super(ptr);
	}

	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Alloc_mem(ptr));
	}

	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_Alloc_mem(this.ptr, mem.ptr);
	}

	public Node getCount() {
		return createWrapper(firm.bindings.binding_irnode.get_Alloc_count(ptr));
	}

	public void setCount(Node count) {
		firm.bindings.binding_irnode.set_Alloc_count(this.ptr, count.ptr);
	}

	public firm.Type getType() {
		Pointer _res = firm.bindings.binding_irnode.get_Alloc_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		firm.bindings.binding_irnode.set_Alloc_type(this.ptr, _val.ptr);
	}

	public firm.bindings.binding_ircons.ir_where_alloc getWhere() {
		int _res = firm.bindings.binding_irnode.get_Alloc_where(ptr);
		return firm.bindings.binding_ircons.ir_where_alloc.getEnum(_res);
	}

	public void setWhere(firm.bindings.binding_ircons.ir_where_alloc _val) {
		firm.bindings.binding_irnode.set_Alloc_where(this.ptr, _val.val);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** memory result */
	public static final int pnM = 0;

	/** pointer to newly allocated memory */
	public static final int pnRes = 1;

	/** control flow when no exception occurs */
	public static final int pnXRegular = 2;

	/** control flow when exception occured */
	public static final int pnXExcept = 3;

	public static final int pnMax = 4;
}
