import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

import static jdk.jpackage.internal.util.CompositeProxy.build;
import static jdk.tools.jlink.internal.plugins.PluginsResourceBundle.getMessage;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private ResponseEntity<Map<String,Object>>build(HttpStatus status, Object message)
        Map<String, Object>body=new HashMap<>();
        body.put ("status", status.value());
        body.put ("message", message);
        return ResponseEntity.status(status).body(body);
}

@ExceptionHandler({AlreadyRequestedException})
public ResponseEntity<Map<String,Object>> conflict (RuntimeException e){
    return build (HttpStatus.CONFLICT,getMessage());
}

@ExceptionHandler({UserAlreadyExistsException})
public ResponseEntity<Map<String,Object>> conflict (RuntimeException e){
    return build (HttpStatus.CONFLICT,getMessage());
}

@ExceptionHandler({TripOverlapException})
public ResponseEntity<Map<String,Object>> conflict (RuntimeException e){
    return build (HttpStatus.CONFLICT,getMessage());
}

@ExceptionHandler({ConflictException})
public ResponseEntity<Map<String,Object>> conflict (RuntimeException e){
    return build (HttpStatus.CONFLICT,getMessage());
}

@ExceptionHandler({TripNotFoundException, UserNotFoundException})
public ResponseEntity<Map<String,Object>> notFound(RuntimeException e){
    return build (HttpStatus.NOT_FOUND,getMessage());

}

@ExceptionHandler({TripNotFoundException, UserNotFoundException})
public ResponseEntity<Map<String,Object>> notFound(RuntimeException e){
    return build (HttpStatus.NOT_FOUND,getMessage());

}



void main() {
}

private Class<? extends Throwable> TripFullException;
private Class<? extends Throwable> UserAlreadyExistsException;
private Class<? extends Throwable> AlreadyRequestedException;
private Class<? extends Throwable> TripOverlapException;