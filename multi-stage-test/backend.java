// Import necessary modules
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    public int subtract(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    public int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    public int divide(@RequestParam int a, @RequestParam int b) {
        return a / b;
    }
    

    // Similarly, you can add methods for subtract, multiply, and divide
}