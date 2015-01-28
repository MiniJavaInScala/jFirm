/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import java.nio.Buffer;

public class Block extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Block(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Block();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Block(Pointer ptr) {
		super(ptr);
	}

	public void setPreds(Node[] preds) {
		firm.bindings.binding_irnode.set_irn_in(this.ptr, preds.length, getBufferFromNodeList(preds));
	}

	public firm.Entity getEntity() {
		Pointer _res = firm.bindings.binding_irnode.get_Block_entity(ptr);
		return new firm.Entity(_res);
	}

	public void setEntity(firm.Entity _val) {
		firm.bindings.binding_irnode.set_Block_entity(this.ptr, _val.ptr);
	}

	
	public void addPred(Node node) {
		firm.bindings.binding_ircons.add_immBlock_pred(ptr, node.ptr);
	}

	public void mature() {
		firm.bindings.binding_ircons.mature_immBlock(ptr);
	}

	@Override
	public Block getBlock() {
		return null;
	}

	public boolean blockVisited() {
		return 0 != firm.bindings.binding_irnode.Block_block_visited(ptr);
	}

	public void markBlockVisited() {
		firm.bindings.binding_irnode.mark_Block_block_visited(ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
