package com.zyl.award.handler.validator;

import com.zyl.award.annotations.NotBlank;
import com.zyl.award.utils.StringUtil;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotBlankValidator implements ConstraintValidator<NotBlank, Object> {

    @Override
    public void initialize(NotBlank annotation) {
    }

    @Override
    public boolean isValid(Object str, ConstraintValidatorContext constraintValidatorContext) {
        return !StringUtils.isEmpty(str);
    }

}
