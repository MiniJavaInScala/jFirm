package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.NativeLong;


public interface binding_irmode extends Library {
	public static enum ip_view_state {
		ip_view_no(),
		ip_view_valid(),
		ip_view_invalid();
		public final int val;
		private static class C { static int next_val; }

		ip_view_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ip_view_state() {
			this.val = C.next_val++;
		}
		
		public static ip_view_state getEnum(int val) {
			for(ip_view_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum op_pin_state {
		op_pin_state_floats(0),
		op_pin_state_pinned(1),
		op_pin_state_exc_pinned(),
		op_pin_state_mem_pinned();
		public final int val;
		private static class C { static int next_val; }

		op_pin_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		op_pin_state() {
			this.val = C.next_val++;
		}
		
		public static op_pin_state getEnum(int val) {
			for(op_pin_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum mtp_additional_property {
		mtp_no_property(0),
		mtp_property_const(1),
		mtp_property_pure(2),
		mtp_property_noreturn(4),
		mtp_property_nothrow(8),
		mtp_property_naked(16),
		mtp_property_malloc(32),
		mtp_property_weak(64),
		mtp_property_returns_twice(128),
		mtp_property_intrinsic(256),
		mtp_property_runtime(512),
		mtp_property_private(1024),
		mtp_property_has_loop(2048),
		mtp_property_inherited((1<<31));
		public final int val;
		private static class C { static int next_val; }

		mtp_additional_property(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		mtp_additional_property() {
			this.val = C.next_val++;
		}
		
		public static mtp_additional_property getEnum(int val) {
			for(mtp_additional_property entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_modecode {
		irm_BB(),
		irm_X(),
		irm_F(),
		irm_D(),
		irm_E(),
		irm_Bs(),
		irm_Bu(),
		irm_Hs(),
		irm_Hu(),
		irm_Is(),
		irm_Iu(),
		irm_Ls(),
		irm_Lu(),
		irm_LLs(),
		irm_LLu(),
		irm_P(),
		irm_b(),
		irm_M(),
		irm_T(),
		irm_ANY(),
		irm_BAD(),
		irm_max();
		public final int val;
		private static class C { static int next_val; }

		ir_modecode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_modecode() {
			this.val = C.next_val++;
		}
		
		public static ir_modecode getEnum(int val) {
			for(ir_modecode entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_mode_sort_helper {
		irmsh_is_num(16),
		irmsh_is_data(32),
		irmsh_is_datab(64),
		irmsh_is_dataM(128);
		public final int val;
		private static class C { static int next_val; }

		ir_mode_sort_helper(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_mode_sort_helper() {
			this.val = C.next_val++;
		}
		
		public static ir_mode_sort_helper getEnum(int val) {
			for(ir_mode_sort_helper entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_mode_sort {
		irms_auxiliary(0),
		irms_control_flow(1),
		irms_memory((2|ir_mode_sort_helper.irmsh_is_dataM.val)),
		irms_internal_boolean((3|ir_mode_sort_helper.irmsh_is_datab.val)),
		irms_reference((((4|ir_mode_sort_helper.irmsh_is_data.val)|ir_mode_sort_helper.irmsh_is_datab.val)|ir_mode_sort_helper.irmsh_is_dataM.val)),
		irms_int_number(((((5|ir_mode_sort_helper.irmsh_is_data.val)|ir_mode_sort_helper.irmsh_is_datab.val)|ir_mode_sort_helper.irmsh_is_dataM.val)|ir_mode_sort_helper.irmsh_is_num.val)),
		irms_float_number(((((6|ir_mode_sort_helper.irmsh_is_data.val)|ir_mode_sort_helper.irmsh_is_datab.val)|ir_mode_sort_helper.irmsh_is_dataM.val)|ir_mode_sort_helper.irmsh_is_num.val));
		public final int val;
		private static class C { static int next_val; }

		ir_mode_sort(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_mode_sort() {
			this.val = C.next_val++;
		}
		
		public static ir_mode_sort getEnum(int val) {
			for(ir_mode_sort entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_mode_arithmetic {
		irma_uninitialized(0),
		irma_none(1),
		irma_twos_complement(2),
		irma_ones_complement(),
		irma_int_BCD(),
		irma_ieee754(256),
		irma_float_BCD(),
		irma_max();
		public final int val;
		private static class C { static int next_val; }

		ir_mode_arithmetic(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_mode_arithmetic() {
			this.val = C.next_val++;
		}
		
		public static ir_mode_arithmetic getEnum(int val) {
			for(ir_mode_arithmetic entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	Pointer new_ir_mode(String name, /* ir_mode_sort */int sort, int bit_size, int sign, /* ir_mode_arithmetic */int arithmetic, int modulo_shift);
	Pointer new_ir_vector_mode(String name, /* ir_mode_sort */int sort, int bit_size, int num_of_elem, int sign, /* ir_mode_arithmetic */int arithmetic, int modulo_shift);
	int is_mode(Pointer thing);
	/* ir_modecode */int get_mode_modecode(Pointer mode);
	Pointer get_mode_ident(Pointer mode);
	String get_mode_name(Pointer mode);
	/* ir_mode_sort */int get_mode_sort(Pointer mode);
	int get_mode_size_bits(Pointer mode);
	int get_mode_size_bytes(Pointer mode);
	int get_mode_sign(Pointer mode);
	/* ir_mode_arithmetic */int get_mode_arithmetic(Pointer mode);
	int get_mode_modulo_shift(Pointer mode);
	int get_mode_n_vector_elems(Pointer mode);
	Pointer get_mode_link(Pointer mode);
	void set_mode_link(Pointer mode, Pointer l);
	Pointer get_mode_min(Pointer mode);
	Pointer get_mode_max(Pointer mode);
	Pointer get_mode_null(Pointer mode);
	Pointer get_mode_one(Pointer mode);
	Pointer get_mode_minus_one(Pointer mode);
	Pointer get_mode_all_one(Pointer mode);
	Pointer get_mode_infinite(Pointer mode);
	Pointer get_mode_NAN(Pointer mode);
	Pointer get_modeF();
	Pointer get_modeD();
	Pointer get_modeE();
	Pointer get_modeBs();
	Pointer get_modeBu();
	Pointer get_modeHs();
	Pointer get_modeHu();
	Pointer get_modeIs();
	Pointer get_modeIu();
	Pointer get_modeLs();
	Pointer get_modeLu();
	Pointer get_modeLLs();
	Pointer get_modeLLu();
	Pointer get_modeP();
	Pointer get_modeb();
	Pointer get_modeX();
	Pointer get_modeBB();
	Pointer get_modeM();
	Pointer get_modeT();
	Pointer get_modeANY();
	Pointer get_modeBAD();
	Pointer get_modeP_code();
	Pointer get_modeP_data();
	void set_modeP_code(Pointer p);
	void set_modeP_data(Pointer p);
	int mode_is_signed(Pointer mode);
	int mode_is_float(Pointer mode);
	int mode_is_int(Pointer mode);
	int mode_is_reference(Pointer mode);
	int mode_is_num(Pointer mode);
	int mode_is_data(Pointer mode);
	int mode_is_datab(Pointer mode);
	int mode_is_dataM(Pointer mode);
	int mode_is_float_vector(Pointer mode);
	int mode_is_int_vector(Pointer mode);
	int smaller_mode(Pointer sm, Pointer lm);
	int values_in_mode(Pointer sm, Pointer lm);
	Pointer find_unsigned_mode(Pointer mode);
	Pointer find_signed_mode(Pointer mode);
	Pointer find_double_bits_int_mode(Pointer mode);
	int mode_honor_signed_zeros(Pointer mode);
	int mode_overflow_on_unary_Minus(Pointer mode);
	int mode_wrap_around(Pointer mode);
	Pointer get_reference_mode_signed_eq(Pointer mode);
	void set_reference_mode_signed_eq(Pointer ref_mode, Pointer int_mode);
	Pointer get_reference_mode_unsigned_eq(Pointer mode);
	void set_reference_mode_unsigned_eq(Pointer ref_mode, Pointer int_mode);
	int is_reinterpret_cast(Pointer src, Pointer dst);
}