def project_android_binary(
    aapt_mode='aapt2',
    **kwargs
    ):
  native.android_binary(
    aapt_mode=aapt_mode,
    **kwargs
  )


def project_robolectric_test(
    vm_args=None,
    **kwargs
    ):
  native.robolectric_test(
    vm_args=vm_args + ['-Djava.security.egd=file:/dev/./urandom'],
    **kwargs,
  )
