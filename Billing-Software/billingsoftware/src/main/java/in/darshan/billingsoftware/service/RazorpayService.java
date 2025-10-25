package in.darshan.billingsoftware.service;

import com.razorpay.RazorpayException;
import in.darshan.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
