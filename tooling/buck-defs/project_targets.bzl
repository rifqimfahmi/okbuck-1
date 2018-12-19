def project_android_binary(
    aapt_mode='aapt2',
    **kwargs
    ):
  native.android_binary(
    aapt_mode=aapt_mode,
    **kwargs
  )


def project_robolectric_test(
    name,
    vm_args=None,
    **kwargs
    ):
  native.robolectric_test(
    name=name,
    vm_args=vm_args + ['-Djava.security.egd=file:/dev/./urandom'],
    **kwargs
  )

  for i in range(0):
    native.robolectric_test(
        name=name + str(i),
        vm_args=vm_args + ['-Djava.security.egd=file:/dev/./urandom'],
        **kwargs
    )
