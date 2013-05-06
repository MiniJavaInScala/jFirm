/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Pin extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Pin(ptr);
		}
	}

	static void init() {
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_Pin.val, new Factory());
	}

	public Pin(Pointer ptr) {
		super(ptr);
	}

	public Node getOp() {
		return createWrapper(firm.bindings.binding_irnode.get_Pin_op(ptr));
	}

	public void setOp(Node op) {
		firm.bindings.binding_irnode.set_Pin_op(this.ptr, op.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
