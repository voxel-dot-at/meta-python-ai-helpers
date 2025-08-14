# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Weasel: A small and easy workflow system"
HOMEPAGE = "https://github.com/explosion/weasel/"
# NOTE: License in setup.py/PKGINFO is: MIT
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=916e54eda2c616460037d7253d2e2b25"

SRC_URI[sha256sum] = "aabc210f072e13f6744e5c3a28037f93702433405cd35673f7c6279147085aa9"

inherit pypi setuptools3

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS:${PN} += "python3-cloudpathlib python3-confection python3-packaging python3-pydantic python3-requests python3-smart-open python3-srsly python3-typer python3-wasabi"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-click python3-compression python3-core python3-crypt python3-io python3-packaging python3-requests python3-shell"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    pydantic
#    pydantic.v1
#    pytest
#    smart_open
#    typer.testing
#    wasabi.util

PYPI_PACKAGE = "weasel"
